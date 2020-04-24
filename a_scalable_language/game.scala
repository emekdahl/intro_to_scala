println("Let's play Twenty-One!")

var queenDiamonds: Int = 11
var threeClubs: Int = 3
var aceHearts: Int = 1
var fiveSpades: Int = 5
var kingHearts: Int = 12
var jackHearts: Int = 11


def maxHand(handA: Int, handB: Int): Int = {
  if (handA > handB) handA
  else handB
}

// Calculate hand values
var handPlayerA: Int = queenDiamonds + threeClubs + aceHearts + fiveSpades
var handPlayerB: Int = kingHearts + jackHearts

// Find and print the maximum hand value
println(maxHand(handPlayerA, handPlayerB))