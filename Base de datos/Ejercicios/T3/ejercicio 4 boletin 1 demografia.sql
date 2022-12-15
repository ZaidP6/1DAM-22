select sum(hombres) as "Hombres"
from demografia_basica
where (anio between 2002 and 2003) and (provincia = 'Cáceres' or provincia = 'Badajoz');
