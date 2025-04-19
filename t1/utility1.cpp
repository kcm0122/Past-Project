#include <iostream>
#include "utility.h"
using namespace std;

ostream& operator<<(ostream& os, const Position& pos)
{
    os << static_cast<char>(pos.file + 'a') << static_cast<char>(pos.rank + '1');
    return os;
}

// TASK 1: Implement the 6 operator overloading functions of Position, Vector and BooleanMap
// You need to write the full function prototypes and implementations


// TODO 1.1: Position::operator==(const Position&) const
bool Position::operator==(const Position& pos) const{
    return (file==pos.file) && (rank ==pos.rank);
}

// TODO 1.2: Vector::operator+(const Position&) const
Position Vector::operator+(const Position& pos) const{
    _FILE newf=static_cast<_FILE>(pos.file+file);
    _RANK newr=static_cast<_RANK>(pos.rank+rank);
    if (newf<_A ||newf>_H || newr<_1 || newr>_8)
    {
        return pos;
    }
    return Position{static_cast<_FILE>(newf),static_cast<_RANK>(newr)};

}

// TODO 1.3: Vector::operator*(int) const
Vector Vector::operator*(int mul) const{
    return Vector{file*mul,rank*mul};
}

// TODO 1.4: BooleanMap::operator|=(const BooleanMap&)
BooleanMap& BooleanMap::operator|=(const BooleanMap& other){
 for (int rank = 0; rank < NUM_RANKS; rank++) {
        for (int file = 0; file < NUM_FILES; file++) {
            cells[rank][file] = cells[rank][file] || other.cells[rank][file];
        }
    }
    return (*this);

}

// TODO 1.5: BooleanMap::operator&=(const BooleanMap&)
BooleanMap& BooleanMap::operator&=(const BooleanMap& other){
 for (int rank = 0; rank < NUM_RANKS; ++rank) {
        for (int file = 0; file < NUM_FILES; ++file) {
            cells[rank][file] = cells[rank][file] && other.cells[rank][file];
        }
    }
    return (*this);
}

// TODO 1.6: BooleanMap::operator~() const
BooleanMap BooleanMap::operator~() const{
 BooleanMap newmap;
    for (int rank = 0; rank < NUM_RANKS; ++rank) {
        for (int file = 0; file < NUM_FILES; ++file) {
            newmap.cells[rank][file] = !cells[rank][file];
        }
    }
    return newmap;

}
