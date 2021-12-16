# Entreprise

# Description du projet
Cahier des charges
Réalisation d’un micro-service déplacement
Le micro-service devra posséder les routes suivantes :
- findAll() 
o Méthode permettant d’afficher tous les déplacements
- findOne(id) 
o Méthode affichant un déplacement par id
- findNext() 
o Méthode permettant d’afficher uniquement les déplacements à 
venir
- findByPatient(idPatient) 
o Méthode permettant d’afficher tous les déplacements à venir d’un 
patient
- findByInfirmier(idInfirmier) 
o Méthode permettant d’afficher tous les déplacements à venir d’un 
infirmier
- findDetails(id) 
o Méthode permettant d’afficher un déplacement avec les noms
prénom du patient et de l’infirmier
- create(deplacement) 
o Méthode permettant de créer un déplacement
- update(deplacement) 
o Méthode permettant de modifier un déplacement
- delete(id) 
o Méthode permettant de supprimer un déplacement
Un déplacement se caractérise par une id, une idInfirmier, une idPatient, une 
date et un coût