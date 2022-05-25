Втора лабораториска вежба по Софтверско инженерство<a name="TOP"></a>
===================


## Дамјан Бојковски, бр. на индекс 203236 ##


### Control Flow Graph ###
![CFG](https://user-images.githubusercontent.com/100250779/170163397-dd055287-e113-4e9c-a092-bf33cfd1bf74.jpg)

### Цикломатска комплексност ###
Цикломатската комплексност изнесува 9, добиена преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв бројот на предикатни јазли е 8, па P = 8+1 = 9.

### Тест случаи според критериумот Every statement ###
![EveryStatement](https://user-images.githubusercontent.com/100250779/170163390-650b0d97-6900-480e-b513-37b5a4974d84.jpg)

### Тест случаи според критериумот Every path ###
![EveryBranch](https://user-images.githubusercontent.com/100250779/170163352-8660ba2c-f316-4340-a6f5-493f16db9ed7.jpg)

### Објаснување на напишаните unit tests ###

 Користените тестови се функционални за секој statement и branch
	

	Првиот тест го тестираме со assertEquals(list, SILab2.function(resultList)) каде проверуваме дали list е иста со  листата вратена после функцијата function(resultList).

	Во вториот тест гористеме IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> SILab2.function(exceptionList)), така што креираме исклучок од класата IllegalArgumentException и кога ќе се изврши function() би требало да врати поракта од exception
		-Со ова проверуваме дали е вратена порака од соодветниот исклучок assertEquals("List length should be greater than 0", thrown.getMessage());

	Во третиот тест гористеме IllegalArgumentException thrown2 = Assertions.assertThrows(IllegalArgumentException.class, () -> SILab2.function(exceptionList2)), така што креираме исклучок од класата IllegalArgumentException и кога ќе се изврши function() би требало да врати поракта од exception
		-Со ова проверуваме дали е вратена порака од соодветниот исклучок assertEquals("List length should be a perfect square", thrown2.getMessage());