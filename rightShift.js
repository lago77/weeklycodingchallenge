function shiftToRight(a,b) {
   let sol= Math.floor(a/(Math.pow(2,b)));
  return sol;

  }

// console.log("hello");

let test1 = shiftToRight(80, 3)
console.log(10+" "+test1);
 

let test2 = shiftToRight(-24, 2)
console.log(6+" "+test2);
 

let test3 =  shiftToRight(-5, 1)
console.log(-3+" "+test3);
 

let test4 = shiftToRight(4666, 6)
console.log(72+" "+test4);


let test5 = shiftToRight(3777, 6) 
console.log(59+" "+test5);
 

let test6 = shiftToRight(-512, 10)
console.log(-1+" "+test6);


