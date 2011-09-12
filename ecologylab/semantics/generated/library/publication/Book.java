package ecologylab.semantics.generated.library.publication;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.publication.Publication;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Book.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Book extends Publication
{
	/** 
	 */ 
	@simpl_collection("author")	@mm_name("editors")
	private List<Author> editors;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString edition;

	/** 
	 */ 
	@simpl_collection("publication")	@mm_name("table_of_contents")
	private List<Publication> tableOfContents;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL coverImage;

	public Book()
	{ }

	public Book(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Author> getEditors()
	{
		return editors;
	}

	public void setEditors(List<Author> editors)
	{
		this.editors = editors;
	}

	public MetadataString	edition()
	{
		MetadataString	result = this.edition;
		if (result == null)
		{
			result = new MetadataString();
			this.edition = result;
		}
		return result;
	}

	public String getEdition()
	{
		return this.edition == null ? null : edition().getValue();
	}

	public MetadataString getEditionMetadata()
	{
		return edition;
	}

	public void setEdition(String edition)
	{
		if (edition != null)
			this.edition().setValue(edition);
	}

	public void setEditionMetadata(MetadataString edition)
	{
		this.edition = edition;
	}

	public List<Publication> getTableOfContents()
	{
		return tableOfContents;
	}

	public void setTableOfContents(List<Publication> tableOfContents)
	{
		this.tableOfContents = tableOfContents;
	}

	public MetadataParsedURL	coverImage()
	{
		MetadataParsedURL	result = this.coverImage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.coverImage = result;
		}
		return result;
	}

	public ParsedURL getCoverImage()
	{
		return this.coverImage == null ? null : coverImage().getValue();
	}

	public MetadataParsedURL getCoverImageMetadata()
	{
		return coverImage;
	}

	public void setCoverImage(ParsedURL coverImage)
	{
		if (coverImage != null)
			this.coverImage().setValue(coverImage);
	}

	public void setCoverImageMetadata(MetadataParsedURL coverImage)
	{
		this.coverImage = coverImage;
	}
}
