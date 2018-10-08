<?php
$email = $_GET['email'];
$email = htmlspecialchars($email);
$email = urldecode($email);
$email = trim($email);
mail("mrmascon@gmail.com", "Заявка с сайта", "E-mail: ".$email ,"From: example2@mail.ru \r\n");
if (mail("mrmascon@gmail.com", "Заказ с сайта", "E-mail: ".$email ,"From: example2@mail.ru \r\n"))
 {
    echo "сообщение успешно отправлено";
} else {
    echo "при отправке сообщения возникли ошибки";
}
}?>
