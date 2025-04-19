#include "userPiece.h"

// TASK 4.2: isRoyal(const Piece*)
// TODO
bool isRoyal(const Piece* piece){
  const King* kingP = dynamic_cast<const King*>(piece);
    return (kingP != nullptr);
}


// TASK 4.3: Implement any Pawn function(s) here if needed

