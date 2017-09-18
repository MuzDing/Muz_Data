/**
 * 
 */
	function QH(startNum,endNum) {
		var totalNum=0;
		for(var i =startNum;i<endNum;i++){
			totalNum+=i;
		}
		alert(totalNum)
	}
	function WeekChange(num) {
		var week;
		switch (num) {
		case "1":week = "星期一";break;
		case "2":week = "星期2";break;
		case "3":week = "星期3";break;
		case "4":week = "星期4";break;
		case "5":week = "星期5";break;
		case "6":week = "星期6";break;
		case "7":week = "星期7";break;
		default: week="无法识别"
			break;
		}
		return week;
	}
	function NumToWeek() {
		var changedWeek;
		var num = prompt("输入转化的数字:",1);
		
		changedWeek = WeekChange(num);
		alert(changedWeek);
	}
	function ShowUserID(){
		var userID;
		var divInnerHtml;
		var divInnerText;
		userID = document.getElementById("txtUserID").value;
		divInnerHtml = document.getElementById("divTest").innerHTML;
		divInnerTest = document.getElementById("divTest").innerText;
		alert(userID)
		alert(divInnerHtml)
		alert(divInnerTest)
	}
	function ChangLink(){
		document.getElementById("HyLink").innerHTML="baidu";
		document.getElementById("divTest").href = "http://www.baidu.cn";
	}