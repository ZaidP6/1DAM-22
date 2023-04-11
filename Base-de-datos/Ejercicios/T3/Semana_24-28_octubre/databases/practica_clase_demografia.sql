select *, (hombres + mujeres) as "total",
		(mujeres / (hombres + mujeres))*100
from demografia_basica;

select *, (hombres + mujeres) as "total",
		(mujeres::numeric / (hombres + mujeres))*100
from demografia_basica;

select *, (hombres + mujeres) as "total",
		round ((mujeres::numeric / (hombres + mujeres))*100, 2)
		as "% mujeres"
from demografia_basica;
