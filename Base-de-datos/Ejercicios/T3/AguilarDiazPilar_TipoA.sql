--Ejercicio 1

SELECT estacion,provincia,ROUND(AVG(precipitacion_total))
FROM climatologia
WHERE provincia IN('Huesca', 'Zaragoza', 'Teruel') 
			AND fecha::text ILIKE '2019-06-%'::text 
			AND precipitacion_total<20;
			
--Ejercicio 2

SELECT *, sum(precipitacion_0_a_6 + precipitacion_6_a_12 + precipitacion_12_a_18 + precipitacion_18_a_24)
FROM climatologia
WHERE estacion (ILIKE '%f%' OR estacion ILIKE '%t%' OR estacion ILIKE'%x%') AND fecha::text ILIKE '2019-02%'::text;

--Ejercicio 3

SELECT fecha, provincia, estacion,temperatura_maxima, temperatura_minima
FROM climatologia
WHERE estacion LIKE 'Ba' AND temperatura_maxima BETWEEN 25 AND 30 
	AND temperatura_minima < 15 
	AND fecha::text ILIKE '2019-09%' 
	AND fecha::text ILIKE '2019-10%'
ORDER BY racha_viento; 

--Ejercicio 4

SELECT estacion,provincia,fecha,racha_viento,
	CASE 
		WHEN racha_viento>25 AND racha_viento<=40 THEN 'Ventoso'
		WHEN racha_viento>40 AND racha_viento<=60 THEN 'Muy ventoso'
		WHEN racha_viento>25 THEN 'Huracanado'
	END
FROM climatologia
WHERE hora_racha_viento ILIKE '15:00' 
	AND temperatura_maxima>23
	AND fecha::text BETWEEN '2019-03-01' AND '2019-04-30'
ORDER BY racha_viento desc;

--Ejercicio 05

SELECT estacion,provincia,fecha,velocidad_maxima_viento,racha_viento
FROM climatologia
WHERE temperatura_minima>10 AND 
ORDER BY provincia desc, estacion desc, fecha;

