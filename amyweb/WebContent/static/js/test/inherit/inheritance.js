
//=========================继承关系：对象冒充=========================
function ClassA(obj) {
	this.obj = obj;
	
	
	function sayMethodA () {
		alert(88);
		alert("this is sayMethodA: " + obj);
	}
}

function ClassB (obj, name) {
	//把构造函数当成一般的函数处理
	this.mymethod = ClassA;
	this.mymethod(obj);
	delete this.mymethod;//调用父类函数后要删除，避免新增的方法覆盖掉父类的方法
	
	this.name = name;
	
	function sayName () {
		alert(name);
	}
}

var classA = new ClassA("classA");
	classA.sayMethodA();
// var classB = new ClassB("classB", "red");
	// classB.sayMethodA();
	// classB.sayName();


var test =  function (argument) {
  
}();
