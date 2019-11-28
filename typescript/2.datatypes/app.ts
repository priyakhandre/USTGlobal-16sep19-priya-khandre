let myName : string = "priya";
console.log(myName , typeof myName);

let myage =21;
console.log(myage, typeof myage);


let mobile : Number ;
console.log(mobile , typeof mobile);
 

let address;
address = "blore";
address = 3456789;

console.log(address , typeof address);


//

 let a1 = function() : void { 
     console.log("my name is priya")
 }
 a1();

 //
 class person  {

    constructor (public name : string , public age : number) {

    }
     
 }
 let person1 = new person ('priya ', 21);
 console.log(person1);


 class student extends person {
     constructor (name : string , age :number , public rollno : number)
     {
         super(name,age);
         
     }
 }

  let student1=new student('pooja', 25, 123456)
  console.log(student1);
