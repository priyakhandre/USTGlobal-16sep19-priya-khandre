const hobbies=['reading novels','eating','sleeping','roaming']
console.log (typeof hobbies);
const isArrayorNOt = Array.isArray(hobbies);
console.log('hobbies array or not',isArrayorNOt)
const hasCricket = hobbies.includes('cricket');
console.log('using includes method',hasCricket)
hobbies.push('guitar', 'volleyball')
console.log('after push mathod',hobbies)
hobbies.pop();
console.log('after pop method',hobbies)
hobbies.unshift('singing','numismatic')
console.log('after unshift',hobbies)
hobbies.shift()
console.log('after shift',hobbies)

//splice

const hobbies1 = ['sleeping','cricket','eating' ,'coding','roaming']

hobbies1.splice(1,2,'dancing','bird watching')
console.log('after splicing=',hobbies1)

hobbies1.splice(1,0,'shettle','skipping')
console.log('after splicing=',hobbies1)

hobbies1.splice(0,'priya','pooja')
console.log('after splicing=',hobbies1)

//slice

const afterslice=hobbies1.slice(2,4)
console.log('after slice=',hobbies1)
console.log('after slice=',afterslice)

// indexof

const hobbies2 = ['sleeping','cricket','eating' ,'coding','roaming','dancing','shettle']
const indexofCoding = hobbies2.indexOf('coding',2)
console.log('index of coding=',indexofCoding)

// join 

const hobbies3 = ['sleeping','cricket','eating' ,'coding','roaming','dancing','shettle','xyz']
const join1 = hobbies2.join('-')
console.log('after join=',join1)

//map function 

const number=[100,200,300,400]
const number1=number.map(function(value,index){
    let newvalue=value+50;
    return newvalue;
})
console.log('after map=',number1)

//map function fat arrow array

const num2=number.map(value=>value+500)
console.log('after map arrow function',num2)

// filter function

const number5=[100,200,300,400]
const num1=number5.filter(function(value,index)
{
    if(value>200)
    {
        return true
    }else {
        return false
    }

})
console.log('after filter=',num1)


// filter function in fat arrow array

const number6 = [100,200,300,400]
const num6=number6.filter(value => value>200)
console.log('after filter using fat arrow=',num6)






