package com.example.securingweb;

import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;

public class CryptoInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Provider[] providers = Security.getProviders();
	System.out.println("Nombre de fournisseurs de sécurity : " + providers.length);
	for (Provider provider : providers) {
		System.out.println("Provider : "+ provider.getName() + " version " + provider.getVersion());
	}
	
	System.out.println("Les services du fournisseur SunJCE");
	
	Provider provider = Security.getProvider("SunJCE");
	
	System.out.println("Nombre de services du fournisseur SunJCE : " + provider.getServices().size());

	System.out.println("Services du provider " + provider.getName());
	
	for (Service service : provider.getServices()) {
		System.out.println("\t" + service.getType() + " " + service.getAlgorithm());
		
	}
	
	
	System.out.println("Nombre d’algorithmes de type Chiffrement Cipher : "+Security.getAlgorithms("Cipher").size());

	System.out.println("Nombre d’algorithmes de type génération de clé KeyGenerator : "+Security.getAlgorithms("KeyGenerator").size());

	System.out.println("Nombre d’algorithmes de type Code d’Authentification de Message Mac : "+Security.getAlgorithms("Mac").size());

	System.out.println("Nombre d’algorithmes de type Fabrique de clé KeyFactory : "+Security.getAlgorithms("KeyFactory").size());

	System.out.println("Nombre d’algorithmes de type Fabrique de clé secrète SecretKeyFactory : "+Security.getAlgorithms("SecretKeyFactory").size());

	System.out.println("Nombre d’algorithmes de type Stockage de clés KeyStore : "+Security.getAlgorithms("KeyStore").size());

	}

}
