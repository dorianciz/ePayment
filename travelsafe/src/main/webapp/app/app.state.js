 (function() {
     'use strict';

     angular
         .module('travelsafeapp')
         .config(stateConfig);

        stateConfig.$inject = ['$stateProvider', '$urlRouterProvider', '$translateProvider'];

        function stateConfig($stateProvider, $urlRouterProvider, $translateProvider) {

        var eng =
        {
            testing : "Testing",
            english : "English",
            serbian : "Serbian",
            home : "Home",
            insurances : "Insurances",
            buyInsurance : "Buy insurance",
            about : "About us",
            travelSafe : "Travel safe",
            travelSafeWithUs : "Travel safe with us",
            withUs : "with us!",
            chooseYourInsurance : "Choose your insurance",
            step1 : "1",
            step2 : "2",
            step3 : "3",
            step4 : "4",
            step5 : "5",
            informationForPerson : "Enter information for person ",
            insuranceDuration : "Insurance duration: ",
            region : "Region: ",
            numberOfPeople : "Number of people: ",
            amount : "Amount: ",
            choosePerson : "Choose person",
            chooseInsuranceCarrier : "Choose insurance carrier",
            firstName : "First name: ",
            lastName : "Last name: ",
            personalID : "Personal ID: ",
            dateOfBirth : "Date of birth: ",
            passportNumber : "Passport number: ",
            address : "Address: ",
            phoneNumber : "Phone number: ",
            homeInsurance : "Home insurance",
            carInsurance : "Car insurance",
            next : "Next",
            person: "Person",
            regionPlchld : "e.g. Bahami",
            firstNamePlchld : "First name ",
            lastNamePlchld : "Last name ",
            personalIDPlchld : "Personal ID ",
            dateOfBirthPlchld : "Date of birth ",
            passportNumberPlchld : "Passport number ",
            addressPlchld : "Address ",
            phoneNumberPlchld : "Phone number ",
            noCarrierChoosen : "No carrier choosen",
            contact: "Contact"
        };

        var ser =
        {
            testing : "Testiranje",
            english : "Engleski",
            serbian : "Srpski",
            home : "Početna",
            insurances : "Osiguranja",
            buyInsurance : "Kupi osiguranje",
            about : "O nama",
            travelSafe : "Putuj bezbedno",
            travelSafeWithUs : "Putujte bezbedno sa nama",
            withUs : "sa nama!",
            chooseYourInsurance : "Izaberite vaše osiguranje",
            step1 : "1",
            step2 : "2",
            step3 : "3",
            step4 : "4",
            step5 : "5",
            informationForPerson : "Unesite informacije za osobu ",
            insuranceDuration : "Trajanje osiguranja: ",
            region : "Region: ",
            numberOfPeople : "Broj osoba: ",
            amount : "Iznos: ",
            choosePerson : "Izaberite osobu",
            chooseInsuranceCarrier : "Izaberite nosioca osiguranja",
            firstName : "Ime: ",
            lastName : "Prezime: ",
            personalID : "JMBG: ",
            dateOfBirth : "Datum rođenja: ",
            passportNumber : "Broj pasoša: ",
            address : "Adresa: ",
            phoneNumber : "Broj telefona: ",
            homeInsurance : "Osiguranje kuće",
            carInsurance : "Osiguranje vozila",
            next : "Dalje",
            person : "Osoba",
            regionPlchld : "npr. Bahami",
            firstNamePlchld : "Ime ",
            lastNamePlchld : "Prezime ",
            personalIDPlchld : "JMBG ",
            dateOfBirthPlchld : "Datum rođenja ",
            passportNumberPlchld : "Broj pasoša ",
            addressPlchld : "Adresa ",
            phoneNumberPlchld : "Broj telefona ",
            noCarrierChoosen : "Nosilac nije izabran",
            contact: "Kontakt"
        };

        $translateProvider.translations('en',eng);
        $translateProvider.translations('sr',ser);
        $translateProvider.preferredLanguage('sr');
        $translateProvider.useSanitizeValueStrategy('escaped');

        $urlRouterProvider.otherwise('/home');

         $stateProvider
           .state('home', {
                   url: '/home',
                   views: {
                       'content': {
                           templateUrl: 'home/home.html',
                           controller: 'HomeController'
                       },
                       'navbar':{
                           templateUrl: 'navbar/navbar.html',
                           controller: 'NavbarController'
                       }
                   }
               });

    }


    })();