//named function
function fab(num1)
{
    var n1=0,n2=1,n3;
    console.log(n1);
    console.log(n2);
    for (var i=1;i<num1;i++){
        n3 = n1+n2;
        console.log(n3);
        n1=n2;
        n2=n3;
    }
}
fab(5);

// expresion function 

var f2 = function(num2){
var n1=0,n2=1,n3;
console.log(n1) ;
console.log(n2);
for (var i=1;i<num2;i++){
    n3=n1+n2;
    console.log(n3);
    n1=n2;
    n2=n3;
}
}
f2(15)

// fat arrow 

var f3=(num3)=> {
    var n1=0,n2=1,n3;
    console.log(n1)
    console.log(n2)
    for(var i=1;i<num3-1;i++)
    {
        n2=n1+n2;
        console.log(n3);
        n1=n2;
        n2=n3
    }
}
f3(10)


// self invoking

(function(num4){
    var n1=0,n2=1,n3;
    console.log(n1);
    console.log(n2);
    for(var i=1;i<num4-1;i++){
        n3=n1+n2;
        console.log(n3);
        n1=n2;
        n2=n3;
    }
})
(5);