package com.example.dell.searchfoody.ipconfig;

public interface IPConfig {
    String IP="192.168.1.119:80";
    String GET_LIST_QUAN_AN="http://"+IP+"/searchquanan/getquanan.php";
    String GET_LOAI_QUAN_AN="http://"+IP+"/searchquanan/getloaiquanan.php";
    String GET_LIST_MON_AN="http://"+IP+"/searchquanan/getdsmonanid.php";
    String GET_ALL_LOAI_QUAN_AN="http://"+IP+"/searchquanan/getallloaiquanan.php";
    String GET_LOAI_QUAN_AN_BY_ID="http://"+IP+"/searchquanan/getlistquananbyid.php";
}
