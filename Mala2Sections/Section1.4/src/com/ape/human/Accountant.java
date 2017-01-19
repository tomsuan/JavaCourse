package com.ape.human;

import com.ape.Chimp;
import com.ape.Gibbon;
/*
 * this whole class has only package level
 * access
 * you can only create an accountant in the
 * com.ape.human package
 */
class Accountant{
	/*
	 * because the gibbon class is public
	 * even though the gibbon class is in a
	 * different package
	 */
	Gibbon gary=new Gibbon();
	/*
	 * because the chimp class is public even 
	 * though the chimp class in in a different
	 * package
	 */
	Chimp cherie = new Chimp();

}
