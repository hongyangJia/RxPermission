package example.rxpermission;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import rx.permission.RxKtPermission;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxKtPermission rxKtPermission = new RxKtPermission(this);
        rxKtPermission.requestCamera().subscribe(new Observer<Boolean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Boolean aBoolean) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
