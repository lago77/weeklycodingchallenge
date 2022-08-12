function repeat(mystring,N) {
    let mynewstring="";
    // console.log(N);
    if (N==-1 ){
      
        return "";
    }
    else if (N==0){
      
        return "";
    }
    else {
        for (let i = 0; i < N; i++) {
            mynewstring=mynewstring+mystring;
            // console.log(mynewstring);
          }
      
        return mynewstring;
    }

  }

// console.log("hello");

let test1= repeat("-",3);
console.log(test1);
let test2= repeat("A",0);
console.log(test2);
let test3= repeat("c",-1);
console.log(test3);
