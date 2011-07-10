package ecologylab.semantics.generated.library.icdl;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MmdInlineIcdlBookInBooksInIcdlImageResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineIcdlBookInBooksInIcdlImageResult extends Document
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString id;

	/** 
	 */ 
	@simpl_scalar	private MetadataString languages;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL cover;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger height;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger width;

	/** 
	 */ 
	@simpl_scalar	private MetadataString booktitle;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL bookurl;

	public MmdInlineIcdlBookInBooksInIcdlImageResult()
	{ }

	public MmdInlineIcdlBookInBooksInIcdlImageResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	id()
	{
		MetadataString	result = this.id;
		if (result == null)
		{
			result = new MetadataString();
			this.id = result;
		}
		return result;
	}

	public String getId()
	{
		return this.id().getValue();
	}

	public void setId(String id)
	{
		this.id().setValue(id);
	}

	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages().getValue();
	}

	public void setLanguages(String languages)
	{
		this.languages().setValue(languages);
	}

	public MetadataParsedURL	cover()
	{
		MetadataParsedURL	result = this.cover;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.cover = result;
		}
		return result;
	}

	public ParsedURL getCover()
	{
		return this.cover().getValue();
	}

	public void setCover(ParsedURL cover)
	{
		this.cover().setValue(cover);
	}

	public MetadataInteger	height()
	{
		MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public int getHeight()
	{
		return this.height().getValue();
	}

	public void setHeight(int height)
	{
		this.height().setValue(height);
	}

	public MetadataInteger	width()
	{
		MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public int getWidth()
	{
		return this.width().getValue();
	}

	public void setWidth(int width)
	{
		this.width().setValue(width);
	}

	public MetadataString	booktitle()
	{
		MetadataString	result = this.booktitle;
		if (result == null)
		{
			result = new MetadataString();
			this.booktitle = result;
		}
		return result;
	}

	public String getBooktitle()
	{
		return this.booktitle().getValue();
	}

	public void setBooktitle(String booktitle)
	{
		this.booktitle().setValue(booktitle);
	}

	public MetadataParsedURL	bookurl()
	{
		MetadataParsedURL	result = this.bookurl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.bookurl = result;
		}
		return result;
	}

	public ParsedURL getBookurl()
	{
		return this.bookurl().getValue();
	}

	public void setBookurl(ParsedURL bookurl)
	{
		this.bookurl().setValue(bookurl);
	}

}
