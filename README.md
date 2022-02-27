# Pizza
# Click On Demo
  <code>
    <a href="https://drive.google.com/file/d/1gUHgDyUw-7YxmmeioQffQREMUqUIn-Dk/view?usp=sharing" title="Playstore Profile"><img height="140" width="140" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgwJcz642pA7mLR5u44OirKSJjfxOoOqWbpNx7vgDP0NI4snSp68daLp-JccwzoGUIARw&usqp=CAU"></a></code>

# Things we used while making this application
* MVVM
* Recycler View
* Retrofit Library
* Glide

# Dependencies 
    //General Dependencies
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'
    def anko_version = '0.10.0'
    def arch_version = '2.2.0-alpha01'

    implementation 'androidx.core:core-ktx:1.6.0'
    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'com.google.android.material:material:1.3.0-alpha02'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.0'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

     def jetpack_version = "2.3.0"
    def arch_version = '2.2.0-alpha01'
    def retrofit_version = "2.9.0"
    def coroutines = "1.4.1"
    def kotlinCoroutineVersion = "1.4.2"
    def lifecycle_version = "2.4.0-alpha02"

    // ViewModel and LiveData
    implementation "androidx.lifecycle:lifecycle-extensions:$arch_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$arch_version"


    //Coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutineVersion"



    // Retrofit & OkHttp
    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
    implementation "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2"

    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'

    //Room
    implementation "androidx.room:room-runtime:$jetpack_version"
    implementation "androidx.room:room-ktx:$jetpack_version"
    kapt "androidx.room:room-compiler:$jetpack_version"
    kapt "com.android.databinding:compiler:$jetpack_version"
