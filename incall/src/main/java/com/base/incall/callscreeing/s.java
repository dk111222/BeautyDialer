//package com.base.incall.callscreeing;
//
//public class s {
//
//            <service
//    android:name="com.base.incall.InCallServiceImpl"
//    android:directBootAware="true"
//    android:exported="true"
//    android:permission="android.permission.BIND_INCALL_SERVICE">
//            <meta-data
//    android:name="android.telecom.IN_CALL_SERVICE_UI"
//    android:value="true" />
//            <meta-data
//    android:name="android.telecom.IN_CALL_SERVICE_RINGING"
//    android:value="false" />
//            <meta-data
//    android:name="android.telecom.INCLUDE_EXTERNAL_CALLS"
//    android:value="true" />
//
//            <intent-filter>
//                <action android:name="android.telecom.InCallService" />
//            </intent-filter>
//        </service>
//
//        <service
//    android:name=".callscreeing.BCallScreeingService"
//    android:permission="android.permission.BIND_SCREENING_SERVICE">
//            <intent-filter>
//                <action android:name="android.telecom.CallScreeningService" />
//            </intent-filter>
//        </service>
//}
