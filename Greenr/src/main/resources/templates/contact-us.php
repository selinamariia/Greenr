<?php
    $name = $_POST['name'];
    $user_email = $_POST['email'];
    $inquiry = $_POST['inquiry'];

    $email_from = 'contact.rebecka@icloud.com';

    $email_subject = 'New Greenr Inquiry';
    $email_body = "Name: $name.'\n".
        "Email: $user_email.\n".
        "Inquiry: $inquiry.\n";

    $to = "contact.rebecka@gmail.com";
    $headers = "From: $email_from \r\n";
    $headers .= "Reply to: $user_email \r\n";

    mail($to,$email_subject,$email_body,$headers);

    header("Location: contact-us.html");

?>