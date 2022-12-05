<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    $file = storage_path('../assets/calories.txt');
    $text = file_get_contents($file);
    $text = nl2br($text);
    $i=0;
    $array = array($text);
    foreach($array as $arr){
    
        
    }

});
