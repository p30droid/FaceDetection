package com.balvin.myid;

import android.app.Activity;


import com.gata.othertools.PublicVals;
import com.gata.gatasdk.Gata_EventListener;
import com.gata.gatasdk.wrapper_tools;


public class FaceDetection {



    static {
        System.loadLibrary("Present");
    }

    public static final String SDKKey = Constants.ACTIVATION;
    private static final boolean getVideoMode = true;

  //  private static final boolean getVideoMode=! PublicVals.getShowLogos();


    wrapper_tools gwrapper_tools = new wrapper_tools();


    private final Gata_EventListener gGata_EventListener = new Gata_EventListener() {

        @Override
        public void onResult(enmResult Value) {
            ProcessResult(Value);
        }
    };


    public FaceDetection(Activity activity, String token) {


        gwrapper_tools.Gata_INIT(activity, SDKKey, "https://api.presentid.com/api/", gGata_EventListener,
                "FF9803FC", "FFFFFFFF", "FF9803FC", "FFFFFFFF", "FFE703FC");

    }

    public void getLiveNess(IMessageListener listener) {

        gwrapper_tools.Show_Wizard(PublicVals.enmWizardForms.frmLiveness, "", "", "", "");


    }


    public void getCard(IMessageListener listener) {

        gwrapper_tools.Show_Wizard(PublicVals.enmWizardForms.frmCard, "", "", "", "");


    }

    public void getCardLiveness(IMessageListener listener) {

        gwrapper_tools.Show_Wizard(PublicVals.enmWizardForms.frmCardLiveness, "", "", "", "");


    }

    public void getFrmLivenessVoice(IMessageListener listener) {

        gwrapper_tools.Show_Wizard(PublicVals.enmWizardForms.frmLivenessVoice, "", "", "", "");


    }

    public void setOtherWebServiceParams(String[] firstParam, String[] secondParam, IMessageListener listener) {

        gwrapper_tools.setOtherWebServiceParams(firstParam, secondParam);
    }


    public void ProcessResult(Gata_EventListener.enmResult Value) {

        //برای دریافت یک فریم مناسب از ویدئو و ارسال به وب سرویس شباهت میتوانید از تابع زیر استفاده کنید

        gwrapper_tools.getSimapleFrame();
        if ((Value == Gata_EventListener.enmResult.Success) || (Value == Gata_EventListener.enmResult.FaceVerification_VerifySuccess)) {

        } else {
            //Error Or Fake Video
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

}
