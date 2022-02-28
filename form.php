<form method="POST" enctype="multipart/form-data">
Select document to upload (only pdf are allowed): <input required type="file" name="pdf" id="pdf" accept="application/pdf">
<input style="display:block;" type="submit" value="Upload Document" name="submit">
<div id="success-message">   
</div>
</form>
<?php
$target_dir = "uploads/";
$target_file = $target_dir . basename($_FILES["document"]["name"]);
if(isset($_POST["submit"])) {
    move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $target_file);
    echo '<script type="text/javascript">
    const para = document.createElement("p");
    para.innerHTML = "Thank you. Your file is uploaded.";
    document.getElementById("success-message").appendChild(para);
    setTimeout(() => {
        const elem = document.getElementById("success-message");
        elem.parentNode.removeChild(elem);
    }, 2000);    
    </script>';
}
?>

