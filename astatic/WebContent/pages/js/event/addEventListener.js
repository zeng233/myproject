//参考事件处理原理：http://www.webhek.com/event-delegate/
// 找到父元素，添加监听器...
alert(window.document.getElementById("parent-list"));//此处为空 TODO
window.document.getElementById("parent-list").addEventListener("click",function(e) {
	// e.target是被点击的元素!
	// 如果被点击的是li元素
	if(e.target && e.target.nodeName == "li") {
		// 找到目标，输出ID!
		console.log("List item ",e.target.id.replace("post-")," was clicked!");
	}
});