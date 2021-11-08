function drawParentNode(genderImg, customerName, customerId) {
	var can = document.getElementById("mindmapcanvas");
	var context = can.getContext("2d");
	
	var image = document.createElement('img');
	image.src = 'http://localhost:8080/gyf_backoffice_web.war/javax.faces.resource/images/man.png.xhtml';
	image.onload = function() {
		var name = "Luis Revelo";
		var radius = 36;
		var lineWidth = 0;
		var x = (can.width/2)-60;
		var y = can.height-120;
		context.drawImage(image, x, y, 120, 120);
		context.globalCompositeOperation='destination-in';
		context.beginPath();
		context.arc(x, y, radius, 0, 2 * Math.PI, true);
//		context.font = "bold 8px serif";
//		var widthTxt = context.measureText(name).width;
//		var heightTxt = context.measureText(name).height;
//		context.fillText(name, x - (widthTxt/2), y + (heightTxt/2));
	}
	
}