// TASK 3: Implement the 4 Piece-derived classes here
// All classes will inherit the NamedPiece class 
// and implement the remaining pure virtual functions

// TODO 3.1: Leaper class
template <char N, int F, int R>
class Leaper :public NamedPiece<N>
{
    public:
    Leaper(Color ccolor) : NamedPiece<N>(ccolor) { }
    Piece* clone() const override {return new Leaper(*this);}
    
    BooleanMap getMoves(const Board& board) const override{
      BooleanMap moved;
    Position source=this->position;
       Position dest =(Vector{F,R} * (this->isWhite() ? 1 : -1)) + source;
       if (board.piece(dest)==nullptr){
           moved.cell(dest)=true;
           return moved;
       }else if ((board.piece(dest)!=nullptr) && (this->color ==board.piece(dest) ->getColor()))
       {
           moved.cell(dest)=false;
           return moved;
       }else
       {
           moved.cell(dest)=true;
           return moved;
       }
        return moved;    
    }
};


// TODO 3.2: Rider class
template <char N, int F, int R, int RANGE>
class Rider : public NamedPiece<N>
{
 public:
    Rider(Color ccolor) : NamedPiece<N>(ccolor) { }
    Piece* clone() const override {return new Rider(*this);}
    
    BooleanMap getMoves(const Board& board) const override{
      BooleanMap moved;
      Position source=this->position;
      for (int i = 1; i <= RANGE; i++){
          Position dest =(Vector{F,R} * (this->isWhite() ? i : -i)) + source;
          if (board.piece(dest)==nullptr){
              moved.cell(dest)=true;}
              
          if ((board.piece(dest)!=nullptr)&&(this->color!=board.piece(dest)->getColor())){
              moved.cell(dest)=true;
              break;
          }
           if ((board.piece(dest)!=nullptr)&&(board.piece(dest)->getColor()==this->color)) {
              moved.cell(dest)=false;
              break;
          }         
      }
      return moved;
    }
        
};


// TODO 3.3: Compound class
template <char N, typename P1, typename P2>
class Compound:public NamedPiece<N>{
    public:
    Compound(Color ccolor) : NamedPiece<N>(ccolor) { }
    Piece* clone() const override {return new Compound(*this);}
    
    BooleanMap getMoves(const Board& board) const override{
         BooleanMap moved;
         BooleanMap m1,m2;
        P1* p1=new P1(this-> getColor());
        P2* p2=new P2(this-> getColor());
 
        Board tb1=board.getTempBoard(p1,this->getPosition());
          m1=p1->getMoves(tb1);
        Board tb2=board.getTempBoard(p2,this->getPosition());
         m2=p2->getMoves(tb2);
         moved=m1|=m2;
      
    return  moved;

    }
};


// TODO 3.4: Divergent class
template <char N, typename M, typename C>
class Divergent : public NamedPiece<N>
{
  public:
  Divergent(Color ccolor) : NamedPiece<N>(ccolor) { }
    Piece* clone() const override { return new Divergent(*this);}
    
    BooleanMap getMoves(const Board& board) const override{
       M* mPiece=new M(this->getColor());
       C* cPiece=new C(this->getColor());
        BooleanMap moved;
        //moveset of the M piece
        Board tb1 = board.getTempBoard(mPiece, this->getPosition());
        BooleanMap mMove = mPiece->getMoves(tb1);
        // moveset of the C piece
        Board tb2 = board.getTempBoard(cPiece, this->getPosition());
        BooleanMap cMove = cPiece->getMoves(tb2);
        // Get the opponent map
        BooleanMap oppMap = board.getOpponentMap(this->getColor());
        //  bitwise AND  to get the capture and non-capture moves
        BooleanMap capMoves = cMove &= oppMap;
        BooleanMap nonCapMoves = mMove &= ~oppMap;
         
        moved = capMoves |= nonCapMoves;  
        return moved;

    }

};
