console.log('window object',window);
console.log('this keyword',this);
console.log(this==window)

// window.alert('welcome  to the world of javascript');
// alert('welcome to UST global and test yantra')
// let confirmDelete = confirm('are you sure you want to delete');
// console.log('confirm Delete', confirmDelete)


let username = prompt('what is your name', 'priya');
console.log('user name',username)



const person = {
    firstname :'priya',
    age:21,
    lastname:'khandre',
    getname : function ()
    {
        console.log('this keyword',this)
        return this.firstname + ' ' + this.lastname
    }
}
let fullname = person.getname()
console.log('full name',fullname)

