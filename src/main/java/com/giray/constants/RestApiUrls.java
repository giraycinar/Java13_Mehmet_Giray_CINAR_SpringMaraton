package com.giray.constants;

public class RestApiUrls {
    private static final String VERSION = "/v1";
    private static final String API = "/api";
    private static final String TEST = "/test";
    private static final String DEV = "/dev";
    private static final String PROD = "/prod";


    private static final String ROOT = DEV + VERSION;
    public static final String BRANS = ROOT + "/brans";
    public static final String DOKTOR = ROOT + "/doktor";
    public static final String RANDEVU = ROOT + "/randevu";
    public static final String HASTANE = ROOT + "/hastane";
    public static final String RANDEVU_TALEP_EDEN = ROOT + "/randevutalepeden";



    public static final String ADD = "/add";
    public static final String GET_ALL = "/get-all";
    public static final String GET_BY_ID = "/get-by-id";
    public static final String DELETE_BY_ID = "/delete-by-id";
    public static final String CREATE_ERROR = "/create-error";
    public static final String REGISTER = ROOT + "/register";






}
