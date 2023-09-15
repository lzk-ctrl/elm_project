window.onload = function(){
	//显示隐藏按钮DOM数组
	let showBtnArr = document.getElementByClassName('fa-caret-down');
	//获取订单明细数组
	let detailetBoxArr = document.getElementByClassName('order-detailet');
	//默认所有明细都隐藏
	for(let i=0;i<detailetBoxArr.length;i++){
		detailetBoxArr[i].style.display='none';
	}
	
	for(let i=0;i<showBtnArr.length;i++){
		showBtnArr[i].onclick = function(){
			if(detailetBoxArr[i].style.display=='none'){
				detailetBoxArr[i].style.display='block';
			}else{
				detailetBoxArr[i].style.display='none';
			}
		}
	}
}