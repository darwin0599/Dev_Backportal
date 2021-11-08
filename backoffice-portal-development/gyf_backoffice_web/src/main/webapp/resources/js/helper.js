function isAlphanumericKey(evt) {
	var key;
	if (evt.keyCode)
		key = evt.keyCode;
	else if (evt.which)
		key = evt.which;
	if (" " === String.fromCharCode(key)
			|| (/[^A-Za-z0-9]/.test(String.fromCharCode(key)))) {
		// Para firefox, se debe habilitar el backspace (codigo 8).
		return false;
	} else {
		return true;
	}
}

function closeApp() {
	//alert("Cerrando sesi\xF3n y aplicaci\xF3n.");
	try {
		document.location.href = "/" + getContextName()+ "/logout/index.html";
	} catch (error) {
		document.location.href = "/" + getContextName()+ "/logout/index.html";
	}
}


function getContextName() {
	var pathName = document.location.pathname.substr(1);				
	var slashPosition = pathName.indexOf("/");			
	return (pathName.substr(0, slashPosition));
}