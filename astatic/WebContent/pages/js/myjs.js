var x=1;
foo:{
    x=2;
    break foo;
    x=3;
}

console.log(x);