package com.mobiletraderv.paul.di.component;

import android.content.Context;

import com.mobiletraderv.paul.di.module.MvvMModule;
import com.mobiletraderv.paul.di.module.PicassoModule;
import com.mobiletraderv.paul.repository.MobiletraderRepository;
import com.mobiletraderv.paul.model.Api;
import com.mobiletraderv.paul.di.module.NetworkModule;
import com.mobiletraderv.paul.di.module.ContextModule;
import com.mobiletraderv.paul.di.qualifier.ApplicationContext;
import com.mobiletraderv.paul.di.scope.ApplicationScope;
import com.mobiletraderv.paul.viewmodels.RegistrationViewModel;
import com.squareup.picasso.Picasso;
import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, NetworkModule.class, MvvMModule.class, PicassoModule.class })
public interface ApplicationComponent {

    Api getApiService();
    Picasso getPicasso();
    MobiletraderRepository getPersistenceData();

    @ApplicationContext
    Context getContext();
    void inject(RegistrationViewModel models);

}








