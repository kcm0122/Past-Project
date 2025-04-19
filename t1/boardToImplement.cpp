#include <iostream>
#include "board.h"
#include "piece.h"
using namespace std;

/**
 * TASK 2.1: Board copy constructor
*/
Board::Board(const Board& board)
{
     for (int r = 0; r < NUM_RANKS; r++) {
        for (int f = 0; f < NUM_FILES; f++) {
            if (board.pieces[r][f] != nullptr) {
                pieces[r][f] = board.pieces[r][f]->clone();
                pieces[r][f]->setPosition(Position{static_cast<_FILE>(f),static_cast<_RANK> (r)});
            } else {
                pieces[r][f] = nullptr;}
        }
    }
    isWhiteTurn = board.isWhiteTurn;
  
    if (board.selectedPiece == nullptr) {
        selectedPiece = nullptr;} 
    else {
         Position selectedPiecePos = board.selectedPiece->getPosition();
        selectedPiece  = pieces[selectedPiecePos.rank][selectedPiecePos.file];
        selectedPiece->setPosition(selectedPiecePos);
    }

    for (int i = 0; i < NUM_RANKS; i++) {
        for (int j = 0; j < NUM_FILES; j++) {
           moveMap=board.moveMap;}
    }

    for (int i = 0; i < 2; i++) {
        if (board.royalPieces[i] == nullptr) {royalPieces[i] = nullptr;} 
        else {
            Position royalPiecePos = board.royalPieces[i]->getPosition();
            royalPieces[i] = pieces[royalPiecePos.rank][royalPiecePos.file];
            royalPieces[i]->setPosition(royalPiecePos);
        }
    }

}

/**
 * TASK 2.2: Board destructor
*/
Board::~Board() 
{
    for (int i = 0; i < NUM_RANKS; i++) {
        for (int j = 0; j < NUM_FILES; j++) {
            delete pieces[i][j]; }
    }
}

/**
 * TASK 4.1: Board::move(const Position&)
*/
void Board::move(const Position& destPos)
{
    // Safeguard against misusage of move()
    if (!selectedPiece) {
        cout << "ERROR: Piece not selected, cannot call move()" << endl;
        return;
    }
   
    
   // bool test=(selectedPiece==royalPieces[isWhiteTurn]);
    if (piece(destPos)){
        delete piece(destPos);}
    
    piece(destPos)=selectedPiece;
    piece(selectedPiece->getPosition())=nullptr;
    piece(destPos)->setPosition(destPos);
    /*if (test)
    {
        royalPieces[isWhiteTurn]=piece(destPos);
    }*/

    
    
    isWhiteTurn= !isWhiteTurn;
}

/**
 * TASK 4.2: Board::getAttackingMap() const
*/
BooleanMap Board::getAttackingMap() const
{
    // TODO
   // return BooleanMap{};
   BooleanMap atMap;
   for (int file = 0; file < NUM_FILES; file++) {
        for (int rank = 0; rank < NUM_RANKS; rank++) {
            Piece* curPiece = pieces[rank][file];
            if (curPiece != nullptr && curPiece->isWhite() == isWhiteTurn) {
                atMap|= curPiece->getMoves(*this) &= this->getOpponentMap(curPiece->isWhite()) ;
            }
        }
    }
    return atMap;

}

/**
 * TASK 4.3: Board::validateMoveMap()
*/
void Board::validateMoveMap()
{
    // TODO
    for (int r = 0; r < 8; r++){
        for (int f = 0; f < 8; f++){
            if (moveMap.cell(static_cast<_FILE>(f),static_cast<_RANK>(r))){
                Board temp {*this};
                temp.move(Position{static_cast<_FILE>(f),static_cast<_RANK>(r)});
                 
                BooleanMap at_m=temp.getAttackingMap();
                Piece* roy=temp.royalPieces[isWhiteTurn];
                if (roy!=nullptr){
                 Position temp_r=roy->getPosition();
                   
                   if (at_m.cell(temp_r)){
                    moveMap.cell(static_cast<_FILE>(f), static_cast<_RANK>(r))=false;}
                }
        }
    }
}

}