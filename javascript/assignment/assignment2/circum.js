//named function
function circum(n1){
    var c1 = 2*3.14*n1;
    return c1;
}
console.log('by named function', circum(3));


//expresion function
var f = function(n2)
{
    var c2 = 2*3.14*n2;
    return c2;
}
console.log('by expresion function' +f(4));

//fat arrow

var f1 = (n3) =>
console.log('by arrow function' +2*3.142*n3);
f1(5);

// by self invoking

(function (n4)
{
    console.log("by self invoking=" +2*3.142*n4);

})(6);
