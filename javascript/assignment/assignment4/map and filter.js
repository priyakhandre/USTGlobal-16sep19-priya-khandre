const items = [{ 
    name:'earing',
    id:1,
    price:5000

},{
    name:'kajal',
    id:2,
    price:1000
},{
    name:'trimmer',
    id:3,
    price:3000
},{
    name:'set wet',
    id:4,
    price:170
}]

// map
const updatedItem = items.map(function(items,index){
    items.price =items.price+300;
    return items ;
})
console.log('after map=',updatedItem)



const item1=items.map((value)=>
{
    value.price = value.price+300;
    return value;
})
console.log('after map=',item1)



// filter
const num6=items.filter((items)=>items.price>1000)
console.log('after filter using fat arrow=',num6)
