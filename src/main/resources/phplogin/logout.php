<?php 

session_start();
session_destroy();

header("Location: ../static/index.html");

?>