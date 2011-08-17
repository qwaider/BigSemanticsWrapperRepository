package ecologylab.semantics.generated.library.icdl;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.generated.library.icdl.IcdlBook;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  IcdlImageResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/17/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Thumbnail Image
 */ 
@simpl_inherit
@xml_tag("response")
public class IcdlImageResult extends Document
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("book")	@mm_name("books")
	private List<IcdlBook> books;

	public IcdlImageResult()
	{ }

	public IcdlImageResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<IcdlBook> getBooks()
	{
		return books;
	}

	public void setBooks(List<IcdlBook> books)
	{
		this.books = books;
	}
}
