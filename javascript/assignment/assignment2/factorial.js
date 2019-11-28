// named functions

function factorial(num1)
{
    var fact=1;
    for(var i=1;i<=num1;i++)
    {
        fact=fact*i;
    }
    return fact; 
}
    var f1 = factorial(5);
    console.log('By named function=',f1);

    // expression function 
     var f2 = function(n2){
         var fact2=1;
         for(var i=1;i<=n2;i++)
        {
            fact2=fact2*i;
        }
        return fact2;
     }
     console.log("by expression function", f2(3));


     //fat arrow function 

     var f3 = (n3)=> {
         var fact3 = 1;
         for(var i=1;i<=n3;i++)
         {
             fact3=fact3*i;

         }
         return fact3;
     }
     console.log("by fat arrow=" +f3(4))

     //self invoking function

     (function (n4)
     {
         var fact4 = 1;
         for (var i=1;i<=n4;i++)
         {
             fact4=fact4*i;

         }
         console.log("by self invoking=",fact4);
     })
     (2);
