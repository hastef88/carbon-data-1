package org.wso2.carbon.dataservices.core.test.util;

import org.apache.axis2.context.ConfigurationContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.ComponentInstance;
import org.wso2.carbon.dataservices.core.internal.DataServicesDSComponent;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Dictionary;

/**
 * Created by rajith on 10/9/15.
 */
public class DSComponentExtension extends DataServicesDSComponent {
    public void activate() {
        ComponentContext ctxt = new ComponentContext() {
            @Override
            public Dictionary getProperties() {
                return null;
            }

            @Override
            public Object locateService(String s) {
                return null;
            }

            @Override
            public Object locateService(String s, ServiceReference serviceReference) {
                return null;
            }

            @Override
            public Object[] locateServices(String s) {
                return new Object[0];
            }

            @Override
            public BundleContext getBundleContext() {
                BundleContext bundleContext = new BundleContext() {
                    @Override
                    public String getProperty(String s) {
                        return null;
                    }

                    @Override
                    public Bundle getBundle() {
                        return null;
                    }

                    @Override
                    public Bundle installBundle(String s, InputStream inputStream) throws BundleException {
                        return null;
                    }

                    @Override
                    public Bundle installBundle(String s) throws BundleException {
                        return null;
                    }

                    @Override
                    public Bundle getBundle(long l) {
                        return null;
                    }

                    @Override
                    public Bundle[] getBundles() {
                        return new Bundle[0];
                    }

                    @Override
                    public void addServiceListener(ServiceListener serviceListener, String s) throws InvalidSyntaxException {

                    }

                    @Override
                    public void addServiceListener(ServiceListener serviceListener) {

                    }

                    @Override
                    public void removeServiceListener(ServiceListener serviceListener) {

                    }

                    @Override
                    public void addBundleListener(BundleListener bundleListener) {

                    }

                    @Override
                    public void removeBundleListener(BundleListener bundleListener) {

                    }

                    @Override
                    public void addFrameworkListener(FrameworkListener frameworkListener) {

                    }

                    @Override
                    public void removeFrameworkListener(FrameworkListener frameworkListener) {

                    }

                    @Override
                    public ServiceRegistration<?> registerService(String[] strings, Object o,
                                                                  Dictionary<String, ?> stringDictionary) {
                        return null;
                    }

                    @Override
                    public ServiceRegistration<?> registerService(String s, Object o, Dictionary<String, ?> stringDictionary) {
                        return null;
                    }

                    @Override
                    public <S> ServiceRegistration<S> registerService(Class<S> sClass, S s,
                                                                      Dictionary<String, ?> stringDictionary) {
                        return null;
                    }

                    @Override
                    public ServiceReference<?>[] getServiceReferences(String s, String s2) throws InvalidSyntaxException {
                        return new ServiceReference<?>[0];
                    }

                    @Override
                    public ServiceReference<?>[] getAllServiceReferences(String s, String s2) throws InvalidSyntaxException {
                        return new ServiceReference<?>[0];
                    }

                    @Override
                    public ServiceReference<?> getServiceReference(String s) {
                        return null;
                    }

                    @Override
                    public <S> ServiceReference<S> getServiceReference(Class<S> sClass) {
                        return null;
                    }

                    @Override
                    public <S> Collection<ServiceReference<S>> getServiceReferences(Class<S> sClass, String s)
                            throws InvalidSyntaxException {
                        return null;
                    }

                    @Override
                    public <S> S getService(ServiceReference<S> sServiceReference) {
                        return null;
                    }

                    @Override
                    public boolean ungetService(ServiceReference<?> serviceReference) {
                        return false;
                    }

                    @Override
                    public File getDataFile(String s) {
                        return null;
                    }

                    @Override
                    public Filter createFilter(String s) throws InvalidSyntaxException {
                        return null;
                    }

                    @Override
                    public Bundle getBundle(String s) {
                        return null;
                    }
                };
                return bundleContext;
            }

            @Override
            public Bundle getUsingBundle() {
                return null;
            }

            @Override
            public ComponentInstance getComponentInstance() {
                return null;
            }

            @Override
            public void enableComponent(String s) {

            }

            @Override
            public void disableComponent(String s) {

            }

            @Override
            public ServiceReference getServiceReference() {
                return null;
            }
        };
        this.activate(ctxt);
    }
}
