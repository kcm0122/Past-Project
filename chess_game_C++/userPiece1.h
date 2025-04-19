#ifndef __USERPIECE_H__
#define __USERPIECE_H__

#include "piece.h"

bool isRoyal(const Piece* piece);

// The following 2 classes are given as example
using Knight = OmniLeaper<'N', 2, 1>;

using Rook = OmniRider<'R', 1, 0>;

// TASK 4.1: Define the 3 classes Bishop, Queen, King similar to above
// TODO
using Bishop = OmniRider<'B', 1, 1>;
using Queen =Compound<'Q',OmniRider<'Q',1, 0>,OmniRider<'Q', 1, 1>>;
using King = Compound<'K',OmniLeaper<'K', 1, 1>,OmniLeaper<'K', 1, 0>>;

// TASK 4.3: Define the Pawn class
// TODO

class Pawn : public Divergent<'P', Leaper<'P', 0, 1>,Rider<'P', 0, 1, 1>>
{
    public:
    Pawn(Color color) : Divergent<'P', Leaper<'P', 0, 1>,Rider<'P', 0, 1, 1>>(color) {}
    Piece* clone() const override{ return new Pawn(*this);}

    BooleanMap getMoves(const Board& board) const override{
      BooleanMap moved = Divergent::getMoves(board);
      bool mv=false;
      Position forwo= {(this->isWhite() ? Vector{0,1} : Vector{0,-1})+this->getPosition()};
        
        if (this->getPosition().rank == (this->isWhite() ? _2 : _7)){       
            Position twostep{(this->isWhite() ? Vector{0,2} : Vector{0,-2})+this->getPosition()}; 
            if (board.piece(forwo) != nullptr){}
            else{
                if (board.piece(twostep)!= nullptr){}
                else{
                     moved.cell(twostep) = true;}}
        }
            
            if (this->getColor()==BLACK){
                for (_RANK r = _8; r >= _1; r = static_cast<_RANK>(r-1)) {
                    for (_FILE f = _A; f <=_H; f = static_cast<_FILE>(f+1)) {
                     if (mv==true){break;}
                     if (moved.cell(f,r)==true){
                         if ((f+1)<=_8)
                         {
                             if (board.piece(static_cast<_FILE>(f+1),static_cast<_RANK>(r))!=nullptr && board.piece(static_cast<_FILE>(f+1),static_cast<_RANK>(r))->getColor()!=this->getColor()) {//&& (f+1<=7)
                         moved.cell(static_cast<_FILE>(f+1),static_cast<_RANK>(r))=true;}
                         }
                         if ((f-1)>=_1)
                         {
                           if (board.piece(static_cast<_FILE>(f-1),static_cast<_RANK>(r))!=nullptr&&board.piece(static_cast<_FILE>(f-1),static_cast<_RANK>(r))->getColor()!=this->getColor()){//&& (f-1>=0
                         moved.cell(static_cast<_FILE>(f-1),static_cast<_RANK>(r))=true;}
                         }
         
                         mv=true;}}  
                if (mv==true){break;}}}
                
                if (this->getColor()==WHITE){
                    for (_RANK r = _1; r <= _8; r = static_cast<_RANK>(r+1)) {
                        for (_FILE f = _A; f <=_H; f = static_cast<_FILE>(f+1)) {
                            if (mv==true){break;}
                            if (moved.cell(f,r)==true){
                                if ((f+1)<=_8)
                                {
                                   if (board.piece(static_cast<_FILE>(f+1),static_cast<_RANK>(r))!=nullptr && board.piece(static_cast<_FILE>(f+1),static_cast<_RANK>(r))->getColor()!=this->getColor() ) {//&& (f+1<=7)
                                moved.cell(static_cast<_FILE>(f+1),static_cast<_RANK>(r))=true;}
                                }
                                if ((f-1)>=_1)
                                {
                                    if (board.piece(static_cast<_FILE>(f-1),static_cast<_RANK>(r))!=nullptr&&board.piece(static_cast<_FILE>(f-1),static_cast<_RANK>(r))->getColor()!=this->getColor()){//&& (f-1>=0
                                moved.cell(static_cast<_FILE>(f-1),static_cast<_RANK>(r))=true;}
                                }
                                
                                mv=true;}}  
                                if (mv==true){break;}}}   
                
        if (board.piece(forwo)){moved.cell(forwo)=false;}
        return moved;}
    
};
#endif // __USERPIECE_H__