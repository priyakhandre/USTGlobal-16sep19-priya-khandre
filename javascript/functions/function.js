//named functions
function add (num1,num2)
{
    console.log('sum=',num1+num2);

}
add(10,20);
// method overloading is not allowed
function add (num1,num2,num3)
{
    console.log('sum=',num1+num2+num3);

}
add(10,20+40);


//Function Expression (anonymous)
var sub=function(num1,num2)
{
    return num1-num2;
}
 var value=sub(100,30);
 console.log(value)

 // self invoked function
console.log('hello');
 (function(num1,num2){
     console.log('value=',num1*num2);
 }) (10,20)



//fat arrow function

var div=(num1,num2)=>
{
    console.log('value=',num1+num2);
}
div(10,20)

//
greet ('priya');
var greet=function(msg)
{
    console.log('hi',msg);
}



//

greet('pooja');
var greet=(msg)=>
{
    console.log('hi',msg);
}