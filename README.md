# rpn-calisthenics-object
kata de calculatrice en reverse polish notation (version calisthenics objects)


## reverse polish notation calculator

Reverse Polish notation (RPN) is a mathematical notation in which every operator follows all of its operands, in contrast to Polish notation (PN), which puts the operator before its operands.

_exemples:_

- 5 3 + => 5+3 => 8

- 6 2 /  => 6/2 => 3

- 5 2- 7+ => 10

- 7 5 2 -+ => 10

- 3 5 8 x 7 + x => 3x((5x8)+7) => 141

- 3 4 2 1+x+2/ => (3 + (4 x (2+1)))/2 => 7.5 

- 1 2 + 4 × 5 + 3 − => ((1+2) x 4) + 5 - 3 => 14

In other way,

- 3 5 4 1 2 + × + − => 5 + (4 x (1+2)) - 3 


## Object calisthenics
After implementations was done, try to follows theses constraints:

- Only One Level Of Indentation Per Method
- Don’t Use The ELSE Keyword
- Wrap All Primitives And Strings
- First Class Collections (Collection encapsulation)
- One Dot Per Line (don't break Demeter Law)
- Don’t Abbreviate (abbrevation needs is a smell of too complex method/class/ect)
- Keep All Entities Small (50 lines max)
- No Classes With More Than Two Instance Variables
- No Getters/Setters/Properties

more détails here: http://williamdurand.fr/2013/06/03/object-calisthenics/



