**Description**

 Android RxJava Request permission library,Internal implementation request permission, successful ||  failure interface interaction

 Support internationalization(English Chinese) 

**Support Kotlin**

For more information please see the https://github.com/hongyangJia/RxKotlinPermission.

**Getting started**

**The first step is to include RxKotlinPermission into your project, for example, as a Gradle compile dependency:**

      maven { url 'https://jitpack.io' }
      compile 'com.github.hongyangJia:RxPermission:1.0.0'
      
       ext {
             rxJava = 'io.reactivex.rxjava2:rxkotlin:x.x.x'
             appcompat = 'com.android.support:appcompat-v7:x.x.x'
             permission = 'com.github.hongyangJia:RxKotlinPermission:1.1.4'
      }
      
**write the request  permission program(impl Consumer )**
    
    RxKtPermission rxKtPermission = new RxKtPermission(this);
          rxKtPermission.requestCamera().subscribe(new Consumer<Boolean>() {
              @Override
              public void accept(@io.reactivex.annotations.NonNull Boolean aBoolean) throws Exception {
                  /**
                   *success
                   */
              }
          });

**write the request  permission program(impl Observer )**
    
         RxKtPermission rxKtPermission = new RxKtPermission(this);
             rxKtPermission.requestCamera().subscribe(new Observer<Boolean>() {
                 @Override
                 public void onSubscribe(Disposable d) {
                     
                 }
     
                 @Override
                 public void onNext(Boolean aBoolean) {
                    /**
                      *success
                      */
                 }
     
                 @Override
                 public void onError(Throwable e) {
                     /**
                       *Error
                       */
                 }
     
                 @Override
                 public void onComplete() {
     
                 }
             });

**Custom title or message or dialog:**
     
           KtPermissionSetting.INSTANCE.Setting(
                   new KtRequest.Builder().title("title").message("message")
                   .rxDialog(new DefaultTemplate(this)).build(this));

 
 