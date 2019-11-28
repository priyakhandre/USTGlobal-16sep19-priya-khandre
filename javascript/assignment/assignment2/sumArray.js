// named function 
 function sumArray(array){
     var sum=0;
     for(var i=0;i<array.length;i++){
         sum=sum+array[i];

     }
     return sum;
 }
 console.log('sum of array='+sumArray([10,20,30,40]));


 // expresion 

 var arr = function (array){
     var sum=0;
     for(var i=0;i<array.length;i++){
         sum=sum+array[i];

     }
     return sum;

 }
 console.log('sum of arry is=' +arr([10,20,30,40]));

 //self invoking
 (function(array)
 {
     var sum=0;
     for(var i=0;i<array.length;i++){
         sum=sum+array[i];
     }
     console.log('sum of array='+sum);

 })
 ([10,20,30,40]);