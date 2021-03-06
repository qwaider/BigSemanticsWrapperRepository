//
// Page.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.GoogleBookNS 
{
	[SimplInherit]
	public class Page : Document
	{
		[SimplScalar]
		private MetadataParsedURL pageThumbnail;

		[SimplScalar]
		private MetadataInteger pageNumber;

		public Page()
		{ }

		public Page(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL PageThumbnail
		{
			get{return pageThumbnail;}
			set
			{
				if (this.pageThumbnail != value)
				{
					this.pageThumbnail = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger PageNumber
		{
			get{return pageNumber;}
			set
			{
				if (this.pageNumber != value)
				{
					this.pageNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
