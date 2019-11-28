//named  function
function prime(num)
{
    var count=1,i=1;
    while(i<=num/2)
    {
        if(num%i==0)
        count++;
        i++
    }
    if(count==2)
    console.log('prime number=' +num);
    else
    console.log('not prime=' +num);
}
prime(5);

//expresion function 

var pri = function(num){
    var count=1,i=1;
    while(i<=num/2)
    {
        if(num%i==0)
        count++
        i++;
    }
    if(count==2)
    console.log(num+ 'is prime');
    else 
    console.log(num+ 'is not prime');

}
