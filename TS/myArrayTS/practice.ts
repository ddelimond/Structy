import myArray from './myArray'

let bracket:myArray<number> = new myArray();

bracket.insert(1);
bracket.insert(2);
bracket.insert(3);
bracket.insert(4);
bracket.insert(5);

console.log(bracket.mirror());