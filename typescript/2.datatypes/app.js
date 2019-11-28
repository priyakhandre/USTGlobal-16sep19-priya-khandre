var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "priya";
console.log(myName, typeof myName);
var myage = 21;
console.log(myage, typeof myage);
var mobile;
console.log(mobile, typeof mobile);
var address;
address = "blore";
address = 3456789;
console.log(address, typeof address);
//
var a1 = function () {
    console.log("my name is priya");
};
a1();
//
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person('priya ', 21);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollno) {
        var _this = _super.call(this, name, age) || this;
        _this.rollno = rollno;
        return _this;
    }
    return student;
}(person));
var student1 = new student('pooja', 25, 123456);
console.log(student1);
