package com.example.daggerhilt

/*

    * Dagger Hilt Theory *
# All apps that use Hilt must contain an Application class that is annotated with @HiltAndroidApp.

# There is no need to create components, that will be handled by the Hilt itself.

# In case of application class we annotate the class with @HiltAndroidApp and for rest of the classes
we use @AndroidEntryPoint.

#Modules ->
* Modules are used to provide the object for the third party classes / interfaces whose implementation
is not known.
* In modules we tell the Hilt that whenever we require the object for certain classes or interfaces whose
implementation is not known, so what object we need to return to the call.
* Module contains the implementation.
* Provides method is used in  Module on the functions that return the object.

#Components in Hilt ->
* @InstallIn annotation is used to mark the component to module.
    1. SingletonComponent -> Application
    2. ActivityComponent -> Activity
    3. FragmentComponent -> Fragment

* Component are the interfaces. The different component refers to the scope of that compnent i.e.
the modules in the activity component will create the objects that will be singleton(means one instance
 of the object) for that particular activity.

* The modules defined in the parent component can be used by the below components but vice versa is not
possible. Example if i define the module as singleton component, than i can request for the creation of the
object from the activity class also. But if,
i define the module as fragment component than i cannot request for the creation of the object from the
activity/application class because it will not know how to create the object.

#@Binds Annotation ->
* Whenever we need to bind an interface with an implementation, we use the @Binds annotation.
* The functions are abstract because we need no implementation as the object can be created by Hilt itself.

#Qualifiers
* Qualifiers are like tag, which are used to remove the ambiguity.
* They are used when we have multiple implementation of the same type.

 */