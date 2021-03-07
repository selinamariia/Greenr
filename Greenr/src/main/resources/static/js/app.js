//var singleUploadForm = document.querySelector('#singleUploadForm');
//var singleFileUploadInput = document.querySelector('#singleFileUploadInput');
//var singleFileUploadError = document.querySelector('#singleFileUploadError');
//var singleFileUploadSuccess = document.querySelector('#singleFileUploadSuccess');
//
//const imgDiv = document.querySelector('.profile-pic-div');
//const img = document.querySelector('#photo');
//const file = document.querySelector('#file');
//const uploadBtn = document.querySelector('#uploadBtn');
//
////
////imgDiv.addEventListener('mouseenter', function(){
////    uploadBtn.style.display = "block";
////});
////
////
////imgDiv.addEventListener('mouseleave', function(){
////    uploadBtn.style.display = "none";
////});
//
////
////file.addEventListener('change', function(){
////
////    const choosedFile = this.files[0];
////
////    if (choosedFile) {
////
////        const reader = new FileReader(); 
////
////        reader.addEventListener('load', function(){
////            img.setAttribute('src', reader.result);
////        });
////
////        reader.readAsDataURL(choosedFile);
////    }
////});
//
//
//
//function uploadSingleFile(file) {
//    var formData = new FormData();
//    formData.append("file", file);
//
//    var xhr = new XMLHttpRequest();
//    xhr.open("POST", "uploadFile");
//
//    xhr.onload = function() {
//        console.log(xhr.responseText);
//        var response = JSON.parse(xhr.responseText);
//        if(xhr.status == 200) {
//            singleFileUploadError.style.display = "none";
//            singleFileUploadSuccess.innerHTML = "<p>File Uploaded Successfully.</p><p>Refresh the page for the photo to appear</p>";
//            singleFileUploadSuccess.style.display = "block";
////            location.reload();
//        } else {
//            singleFileUploadSuccess.style.display = "none";
//            singleFileUploadError.innerHTML = (response && response.message) || "Some Error Occurred";
//        }
//    }
//
//    xhr.send(formData);
//}
//
//
//singleUploadForm.addEventListener('submit', function(event){
//    var files = singleFileUploadInput.files;
//    if(files.length === 0) {
//        singleFileUploadError.innerHTML = "Please select a file";
//        singleFileUploadError.style.display = "block";
//    }
//    uploadSingleFile(files[0]);
//    event.preventDefault();
//}, true);
//
